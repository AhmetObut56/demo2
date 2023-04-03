package com.OBUT.accountservice.api;

import com.OBUT.accountservice.entity.Account;
import com.OBUT.accountservice.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController //dış dünyaya açmak için
@RequestMapping ("account") // web adresiyle girmek için
public class AccountApi {

    //burda servisle bağlayacaz
   private final AccountService accountService;

    public AccountApi(AccountService accountService) {
        this.accountService = accountService;
        //burayı @Autowired ile yapabilirdi ama construction inherite etti daha iyi
    }

    @GetMapping("/{id}")//burdaki id path tir
                public ResponseEntity<Account> get(@PathVariable ("id") String id){
                //account un altında id diye bir parametre varsa al onu path ten ilgili servise gönder
                //ikinci parametrenin adı id dir tekten fazla parametre gönderilebilir diye
               return ResponseEntity.ok(accountService.get(id));
                                                    }
//responseEntity tipinde Account nesnesi döndürsün
    // bu servis get metodunu bize parametre olarak gelen id ile çalıştırsın ve ordan gelen sonucu responseEntity nesne tipi ile döndürsün demek ama ok koyunca bu demek nesne tipi ile döndürme
    //son kullanıcı tarafında Apiye bağlanırken özel geri dönüş nesnesi oluşturur tüm api lerde aynı tipte mesaj gönderirsin

    @PostMapping //BUNU BODY İLE ALACAKSIN BODY DEN ALMAK İÇİN REQUEST ANNOTATİON U KULLANACAKSIN
                public ResponseEntity<Account>save(@RequestBody Account account){

                    return ResponseEntity.ok(accountService.save(account));
                                                    }
            @PutMapping
                 public ResponseEntity<Account>update(Account account){
                     return ResponseEntity.ok(accountService.update(account));

                                                    }

                     @DeleteMapping //burada bir şey döndürmeyeceği için sadece metodu çalıştırdı
                    public void delete(String id){
                        accountService.delete(id);
                    //nesnenin sadece ıd sini gönderecek parametre olarak
                         // pagination ile sayfalayarak kayıtlarımızı geri döndürecez

    }





}


    //pagination ile sayfalayarak kayıtlarımızı geri döndürecez


