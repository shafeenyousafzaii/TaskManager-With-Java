//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.error.ErrorPageFilter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class DisableErrorPageFilter {
//
//    @Bean
//    public ErrorPageFilter errorPageFilter() {
//        return new ErrorPageFilter();
//    }
//
//    @Bean
//    public FilterRegistrationBean<ErrorPageFilter> disableErrorFilter(ErrorPageFilter filter) {
//        FilterRegistrationBean<ErrorPageFilter> filterRegistrationBean = new FilterRegistrationBean<>();
//        filterRegistrationBean.setFilter(filter);
//        filterRegistrationBean.setEnabled(false); // 🔥 disables it
//        return filterRegistrationBean;
//    }
//}
