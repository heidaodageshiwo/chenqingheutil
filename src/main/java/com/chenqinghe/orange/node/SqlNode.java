package com.chenqinghe.orange.node;

import com.chenqinghe.orange.context.Context;

import java.util.Set;


public interface SqlNode {

    void apply(Context context);

    void applyParameter(Set<String> set);

}
