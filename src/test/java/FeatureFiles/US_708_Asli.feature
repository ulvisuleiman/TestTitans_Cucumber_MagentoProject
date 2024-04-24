Feature: Add to  Wish List

  #Türkçe

  Scenario: Favori Listesi Remove & Add

    When Magento sitesine giris
    And Sayfaya giris yapma
    Then Urunun sayfasına giris

    And  Favorilere Ekle butonuna tiklanir
    And Dogrulama mesajı alınır
    And Hesabım sayfasına gidis

    And Favorilerim linkine tıklanir
    Then Urun eklenmesi dogrul
    And Kullanici urunun uzerine gittiginde delete butonunu cikar

    When Delete butonuna tıklanır
    Then Yeni dogrulama mesaji alinir