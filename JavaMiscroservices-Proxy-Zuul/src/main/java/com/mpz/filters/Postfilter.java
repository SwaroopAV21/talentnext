package com.mpz.filters;

import com.netflix.zuul.ZuulFilter;
//import com.netflix.zuul.exception.ZuulException;

public class Postfilter extends ZuulFilter {

    @Override
    public Object run() {
        System.out.println("\n Request Post method");
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public int filterOrder() {
        return 1;
        //lower the oder first preference is given
    }

    @Override
    public String filterType() {
        return "post";
        //post for postfilter
        //router for routerfilter
        //pre for prefilter
        //error for errorfilter
    }
    
}
