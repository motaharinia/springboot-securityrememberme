package com.motaharinia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *https://www.javatpoint.com/spring-security-remember-me
 * Spring Security Remember Me:
 * Remember me is a feature that allows a user to access into application without re-login.
 * User's login session terminates after closing the browser and if user again access the application by opening browser, it prompts for login.
 * But we can avoid this re-login by using remember me feature.
 * It stores user's identity into the Cookie or database and use to identity the user.
 * We are implementing this into the following example.
 *اسپرینگ سکیوریتی مرا به خاطر بسپار:
 * به خاطر بسپار من ویژگی ای است که به کاربر امکان ورود به برنامه بدون ورود مجدد را می دهد.
 * جلسه ورود به کاربر پس از بستن مرورگر خاتمه می یابد و اگر کاربر با باز کردن مرورگر دوباره به برنامه دسترسی پیدا کند ، ورود به سیستم را درخواست می کند.
 * اما ما می توانیم با استفاده از ویژگی "مرا به یاد داشته باشید" از ورود مجدد جلوگیری کنیم.
 * این هویت کاربر را در کوکی یا پایگاه داده ذخیره می کند و از آن برای هویت کاربر استفاده می کند.
 * ما این را در مثال زیر پیاده سازی می کنیم
 * 
 * Output:
 * Click on Admin login link and login.
 * See, we have clicked on remember me check box.
 * Copy the URL: http://localhost:8080/admin and close the browser completely.
 * After a second open browser and paste the copied URL.
 * See, it does not ask for login and land us on the same page.
 * Because we did check remember me button during login.
 *خروجی:
 * روی لینک ورود به سیستم Admin کلیک کنید و وارد شوید.
 * ببینید ، ما روی کادر یادآوری من کلیک کرده ایم.
 * نشانی را کپی کنید: http://localhost:8080/admin و مرورگر را کاملاً ببندید.
 * بعد از ثانیه ای مرورگر را باز کنید و URL کپی شده را جایگذاری کنید.
 * ببینید ، این درخواست ورود به سیستم را ندارد و ما را در همان صفحه فرود می آورد.
 * از آنجا که ما در هنگام ورود به سیستم ، دکمه من را به خاطر آوردیم
 */
@SpringBootApplication(scanBasePackages = {"com.motaharinia"})
public class SecurityRememberMeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityRememberMeApplication.class, args);
    }

}
