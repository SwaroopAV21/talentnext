package com.mpz.filters;



import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class Prefilter extends ZuulFilter {

    @Override
    public Object run() throws ZuulException {
        RequestContext rc=RequestContext.getCurrentContext();
        HttpServletRequest htreq= rc.getRequest();
        System.out.println("\n Request method"+htreq.getMethod()+"Request URL"+htreq.getRequestURL().toString());
        return null;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public int filterOrder() {
        return 0;
        //lower the oder first preference is given
    }

    @Override
    public String filterType() {
        return "pre";
        //post for postfilter
        //router for routerfilter
        //pre for prefilter
        //error for errorfilter
    }
    
}
