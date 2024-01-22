package mx.markobe.SeguridadSpring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration //Clase de COnfiguración
@EnableWebMvc //Especificamos que se utiliza el Modelo Vista Controlador
@ComponentScan(basePackages = "mx.markobe.SeguridadSpring") //Especifica donde se encuentran los componentes
public class App 
{
    
	@Bean
	public ViewResolver viewResolver() {
		
		//Creamos la Vista que vamos a devolver
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/view/"); //Indicamos la ruta de la vista (Pre fijo)
		
		viewResolver.setSuffix(".jsp"); //Indicamos el tipo de archivo de la vista (Sub fijo)
		
		return viewResolver;
		
	}
	
}
