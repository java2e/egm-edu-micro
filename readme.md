


user-ws

User
id
username
password => hashlenmeiş md5 PasswordEncoder (min 8 karaker olup hem harf hemde rakam içer)
createDate
updateDate => Localdate
deleted => boolean , int
Role

Role
id
roleName

--kullanıcı create
--kullanıcı sifre yenile => Random olusturacak => email,sms => noticatiom micro => kafka rabbitmq

-------------------------------------------------

account-ws

account
id
name
surname
identiyNumber  11 karakate olmalıdır
city
address
birthDate
email
telephone
deleted
created
UpdateDated

1.account olusturma apisi yazılacak create unutmayım kayıt attıktan sonra otomatik olarak user olusturmalıdır
2.account güncelleme
3.account pasif getiriniz.


ticket-ws


ticket
id
user
createdate
updatedate
price
expireDate

ticket Detail
id
title
organization
from
to
date
hour
capacity