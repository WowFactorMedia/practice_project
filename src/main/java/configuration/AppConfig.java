package configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sezzwho.autowire.beans.Mayo;
import sezzwho.autowire.beans.Meat;
import sezzwho.autowire.beans.Sandwich;
import sezzwho.autowire.beans.ToastBread;




/**
 * Only exists to enable component scan.
 * Component scan = @Component on beans + @ComponentScan on configuration(here).
 * 
 * In autowiring we have 2 options: constructor injection & setter injection.
 * 
 * @author Sajid
 *
 */
@Configuration
public class AppConfig {
	
	@Bean // @Autowired
	public Sandwich sandwich(Mayo mo, Meat meat, ToastBread tb ){
		//dependency injection through constructor
		 Sandwich s = new Sandwich(mo, meat, tb );
		 int meatsHash = meat().hashCode();
		 System.out.println(meatsHash);
		 int meatsHash2 = meat().hashCode(); // calling meat() twice, getting same singleton
		 System.out.println(meatsHash2);
		 
		//dependency injection through setter	
		return s;
	}
	
	@Bean
	public Mayo mayo(){
		return new Mayo();
	}
	
	@Bean 
	public Meat meat(){
		return new Meat();
	}
	
	@Bean 
	public ToastBread toastBread(){
		return new ToastBread();
	}
	
}