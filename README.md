# Müşteri Yönetim Sistemi API (Customer Management API)

Bu proje, Java ve Spring Boot kullanılarak geliştirilmiş bir Müşteri Yönetim Sistemi API'sidir. Projede CRUD (Create, Read, Update, Delete) işlemleri gerçekleştirilmekte ve Swagger ile interaktif API dokümantasyonu sağlanmaktadır.

## Proje Genel Bakış

Bu proje aşağıdaki özellikleri içerir:

- Müşteri verileri üzerinde CRUD işlemleri
- RESTful API uç noktaları
- JPA ile veritabanı entegrasyonu
- Swagger UI ile API dokümantasyonu

## Kullanılan Teknolojiler

- **Java**: Projenin ana programlama dili
- **Spring Boot**: Uygulama geliştirme çerçevesi
- **JPA (Hibernate)**: ORM aracı
- **Swagger**: API dokümantasyonu için kullanılan araç
- **MySQL**: Kalıcı veritabanı çözümü

## Gereksinimler

- Java 17 veya üstü
- Maven
- MySQL Server

## Projeyi Çalıştırma

Projeyi yerel ortamınızda çalıştırmak için aşağıdaki adımları izleyin:

1. Depoyu klonlayın:
   ```bash
   git clone https://github.com/mchtozcan/crud-entegration.git
   ```
2. Proje dizinine gidin:
   ```bash
   cd crud-entegration
   ```
3. Maven ile projeyi derleyin:
   ```bash
   mvn clean install
   ```
4. Uygulamayı çalıştırın:
   ```bash
   mvn spring-boot:run
   ```

Uygulama varsayılan olarak `http://localhost:9090` adresinde çalışacaktır.

## Swagger Dokümantasyonu

Uygulama çalışırken, Swagger UI'ye erişerek API uç noktalarını inceleyebilirsiniz:

```
http://localhost:9090/swagger-ui.html
```

Swagger UI, uç noktaların doğrudan tarayıcı üzerinden test edilmesini sağlar.

## API Uç Noktaları

| HTTP Metodu | Uç Nokta            | Açıklama                       |
| ----------- | ------------------- | ------------------------------ |
| GET         | /app/allcustomers   | Tüm müşterileri getirir        |
| POST        | /app/customers      | Yeni bir müşteri oluşturur     |
| GET         | /app/customers/{id} | Belirli bir müşteriyi getirir  |
| PUT         | /app/customers/{id} | Mevcut bir müşteriyi günceller |
| DELETE      | /app/customers/{id} | Belirli bir müşteriyi siler    |

## MySQL Veritabanı Yapılandırması

Projede MySQL kullanımı için aşağıdaki adımları izleyin:

1. MySQL Server'ı kurun ve çalıştırın.
2. Aşağıdaki SQL komutunu kullanarak bir veritabanı oluşturun:
   ```sql
   CREATE DATABASE crud;
   ```
3. `src/main/resources/application.properties` dosyasını aşağıdaki şekilde güncelleyin:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/crud
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
```

## Katkıda Bulunma

Katkılarınızı bekliyoruz! Lütfen katkıda bulunmak için aşağıdaki adımları izleyin:

1. Depoyu çatallayın (fork).
2. Yeni bir dal oluşturun:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Değişikliklerinizi yapın ve kaydedin:
   ```bash
   git commit -m "Add your message here"
   ```
4. Dalınızı depoya itin:
   ```bash
   git push origin feature/your-feature-name
   ```
5. Bir çekme isteği (pull request) oluşturun.

## İletişim

Sorularınız veya geri bildirimleriniz için:

- **GitHub**: [[https://github.com/mchtozcan]




