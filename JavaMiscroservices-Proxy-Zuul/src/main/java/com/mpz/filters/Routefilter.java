package com.mpz.filters;

import com.netflix.zuul.ZuulFilter;


public class Routefilter extends ZuulFilter {

    @Override
    public Object run() {
        System.out.println("\n Request Route method");
        throw new UnsupportedOperationException("Unimplemented method 'run'");
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
