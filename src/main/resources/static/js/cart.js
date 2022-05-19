const productsBtn = document.querySelectorAll('.add-to-cart-btn');
const cartProductsList = document.querySelector('.cart-list');
const cart = document.querySelector('.cart-dropdown');
const cartQuantity = document.querySelector('.qty');
const fullPrice = document.querySelector('.fullprice');
let price = 0;

const randomId = () => {
    return Math.random().toString(36).substring(2, 15) + Math.random().toString(36).substring(2, 15);
};

const priceWithoutSpaces = (str) => {
    return str.replace(/\s/g, '');
};

const normalPrice = (str) => {
    return String(str).replace(/(\d)(?=(\d\d\d)+([^\d]|$))/g, '$1 ');
}

const plusFullPrice = (currentPrice) => {
	return price +=	currentPrice;
};

const minusFullPrice = (currentPrice) => {
	return price -=	currentPrice;
};

const prinFullPrice = () => {
	fullPrice.textContent = `${normalPrice(price)} ₽`;
};

const printQuantity = () => {
	let length = cartProductsList.children.length;
	cartQuantity.textContent = length;
	length > 0 ? cart.classList.add('active') : cart.classList.remove('active')
};

const generateCartProducts = (img, name, price, id, url) => {
    return `

			<div class="product-widget" data-id="${id}">
				<div class="product-img">
					<img src="${img}" alt="">
				</div>
				<div class="product-body">
					<h3 class="product-name"><a href="${url}">${name}</a></h3>
					<h4 class="product-price">${normalPrice(price)} ₽</h4>
				</div>
				<button class="delete"><i class="fa fa-close"></i></button>
			</div>
			
			`;
}

const deleteProducts = (productParent) => {
	let currentPrice = parseInt(priceWithoutSpaces(productParent.querySelector('.product-price').textContent));	
	minusFullPrice(currentPrice);
	prinFullPrice();
	productParent.remove();
	printQuantity();
};

productsBtn.forEach(el => {
	el.closest('.product').setAttribute('data-id', randomId());
	el.addEventListener('click', (e) => {
		let self = e.currentTarget;
		let parent = self.closest('.product');
		let id = parent.dataset.id;
		let img = parent.querySelector('.product-img img').getAttribute('src');
		let name = parent.querySelector('.product-name').textContent;
		let url = parent.querySelector('a').getAttribute('href');
		let priceNumber = parseInt(priceWithoutSpaces(parent.querySelector('.product-price').textContent));	

		plusFullPrice(priceNumber);
		prinFullPrice();
		cartProductsList.insertAdjacentHTML('afterbegin', generateCartProducts(img, name, priceNumber, id, url));
		printQuantity();
	});
});

cartProductsList.addEventListener('click', (e) => {
	if (e.target.classList.contains('delete')){
		deleteProducts(e.target.closest('.product-widget'));
	}
});