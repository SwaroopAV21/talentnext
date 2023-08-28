package com.mpz.filters;

import com.netflix.zuul.ZuulFilter;

public class Errorfilter extends ZuulFilter {

   
 
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
        return "errot";
        //post for postfilter
        //router for routerfilter
        //pre for prefilter
        //error for errorfilter
    }

    @Override
    public Object run() {
        System.out.println("\n Request error method");
        throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
    
}
