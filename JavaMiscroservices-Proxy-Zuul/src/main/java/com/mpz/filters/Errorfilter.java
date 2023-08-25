package com.mpz.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class Errorfilter extends ZuulFilter {

    @Override
    public Object run() throws ZuulException {
        System.out.println("\n Request error method");
        return null;
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
        return "errot";
        //post for postfilter
        //router for routerfilter
        //pre for prefilter
        //error for errorfilter
    }
    
}
