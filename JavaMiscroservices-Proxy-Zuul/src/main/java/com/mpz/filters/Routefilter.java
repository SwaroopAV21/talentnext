package com.mpz.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class Routefilter extends ZuulFilter {

    @Override
    public Object run() throws ZuulException {
        System.out.println("\n Request Route method");
        return null;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public int filterOrder() {
        return 2;
        //lower the oder first preference is given
    }

    @Override
    public String filterType() {
        return "route";
        //post for postfilter
        //router for routerfilter
        //pre for prefilter
        //error for errorfilter
    }
    
}
