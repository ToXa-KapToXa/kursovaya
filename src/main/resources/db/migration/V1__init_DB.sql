-- USERS
create sequence user_seq start 1 increment 1;

create table users (
                       id int8 not null,
                       email varchar(255),
                       name varchar(255),
                       password varchar(255),
                       role varchar(255),
                       primary key (id)
);
-- BUCKET
create sequence bucket_seq start 1 increment 1;

create table buckets (
                         id int8 not null,
                         user_id int8,
                         primary key (id)
);

-- LINK BETWEEN BUCKET AND USER
alter table if exists buckets
    add constraint buckets_fk_user
    foreign key (user_id) references users;

-- PRODUCTS
create sequence product_seq start 1 increment 1;

create table products (
                          id int8 not null,
                          price numeric(19, 2),
                          title varchar(255),
                          image_url varchar(255),
                          primary key (id)
);

-- PRODUCTS IN BUCKET
create table bucket_products (
                                 bucket_id int8 not null,
                                 product_id int8 not null
);

alter table if exists bucket_products
    add constraint bucket_products_fk_product
    foreign key (product_id) references products;

alter table if exists bucket_products
    add constraint bucket_products_fk_bucket
    foreign key (bucket_id) references buckets;
