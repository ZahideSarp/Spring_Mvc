package com.tpe;
//Web.xml yerine bu class'i kullaniyoruz.
//dispatcher Servletin tanimlanmasi, konfigurasyonu ile basliyoruz.
//AbstractAnnotationConfigDispatcherServletInitializer--> bu class dispatcher Servletin  baslatilmasini,config ayarlarinin
//bulundugu dosyanin yerinin gosterilmesini saglar.

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

   /*
   dispatcher Servletin iki tane servlet var
   1-Servlet WebAppContext-> Controller,Handler Mapping,view Resolver
   2-Root WebAppContext-->services,repos
    */


    @Override//db'ye erişim(hibernate/jdbc) için gerekli config class
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
                RootContextConfig.class
        };
    }

    @Override//Controller,Handler Mapping,view Resolver(Spring MVC) ile ilgili config ayarlarini iceren bir class
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
                WebMvcConfig.class
        };

    }

    @Override//hangi url ile gelen request(istekler) servlet tarafindan karsilanacak
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
