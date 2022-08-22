# Enuygun Automation Project

[Enuygun](https://www.enuygun.com/) websitesi için Selenium Framework ile verilen test caseler için otomasyon yazılmıştır.

![image](https://user-images.githubusercontent.com/105527159/185837334-5716fef8-2272-43a9-bdf3-39e592dfe5bf.png)

## Test Case

```
1 - Enuygun Flight ana sayfasına gidilir.
2 - Nereden input alanına Testte parametrik olarak alınan yurtiçi bir şehir ismi girilir.
3 - Çıkan Sonuçlardan ilkine tıklanır.
4 - Nereye input alanına Testte parametrik olarak alınan yurtdışı bir şehir ismi girilir.
5 - Çıkan sonuçlardan ilki seçilir.
6 - Gidiş Tarihi input alanına tıklanır.
7 - Testten parametre olarak bugünden itibaren kaç gün sonra gidilmek istendiği alınacak. Kaç gün sonra ise ona göre tarih seçilecek.
8 - Dönüş Tarihi input alanına tıklanır.
9 - Testten parametre olarak gidişten kaç gün sonra dönülmek istendindiği alınacak. Kaç gün sonra ise ona göre tarih seçilecek.
10 - Ucuz Bilet bul butonuna tıklanır.
11 - Verilen parameterlere uygun gidiş ve dönüş uçuşları bulunur. Bu uçuşlar aynı paket içinde olmak zorundadır.
12 - Gidiş uçuşu seçilir.
13 - Dönüş uçuşu seçilir.
14 - Seç butonuna tıklanır.
```

## Dikkat Edilmesi Gereken 
```
- Provider otomasyonda verilen günler için değişkenlik gösterebilmektedir. Bunun için websitesinde inspect atarak oradan
provider kontrolü yaparak Parametre verilmesi gerekebiliyor.
```
![Adsız2](https://user-images.githubusercontent.com/105527159/185838676-c7fbccc9-99cc-4a06-b52f-cf8761a4174f.png)
![Adsız1](https://user-images.githubusercontent.com/105527159/185838599-4854847c-4314-4cd7-b4fa-5b25352be128.png)


## Allure Report Results
![selen1](https://user-images.githubusercontent.com/105527159/185839196-40245030-e119-41b3-868f-537229f8af6d.PNG)
![selen2](https://user-images.githubusercontent.com/105527159/185839278-6d400173-e2b3-4611-80d4-9f63bd230599.PNG)

## Tech
- Selenium
- Lombok
- Faker
- TestNG
- Allure TestNG

## Author - [PoyrazM](https://github.com/PoyrazM)

