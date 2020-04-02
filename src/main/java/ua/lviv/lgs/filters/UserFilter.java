package ua.lviv.lgs.filters;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import ua.lviv.lgs.FilterService;
import ua.lviv.lgs.entities.UserRole;

@WebFilter({"/cabinet", "/bucket"})
public class UserFilter implements Filter {

  private FilterService filterService = FilterService.getInstance();

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    filterService.validateCallForPage(request, response, chain, Arrays.asList(UserRole.USER, UserRole.ADMIN));
  }

  @Override
  public void destroy() {
  }

  @Override
  public void init(FilterConfig filterConfig) {
  }

}
