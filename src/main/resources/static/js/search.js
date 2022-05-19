document.querySelector('.input').oninput = function () {
    let val = this.value.trim();
    let inputItems = document.querySelectorAll('.search_list li a');
    let input = document.querySelector('.input');
    if (val != '') {
        input.classList.add('active');
        inputItems.forEach(function (elem) {
            if (elem.innerText.search(RegExp(val, "gi")) == -1) {
                elem.classList.add('hide');
            }
            else {
                elem.classList.remove('hide');
            }
        });
    }
    else {
        input.classList.remove('active');
        inputItems.forEach(function (elem) {
            elem.classList.remove('hide');
        });
    }
}