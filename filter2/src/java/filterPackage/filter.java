
package filterPackage;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class filter implements Filter {

   @Override
   public void init(FilterConfig filterConfig) throws ServletException {
      
   }

   @Override
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
     //pre processing 
      System.out.println("before processing!!");
      //..authentication area
      //...
      chain.doFilter(request, response);
      //post processing
      System.out.println("after processing!!");
      //...
      //...
   }

   @Override
   public void destroy() {
      
   }
   
}
