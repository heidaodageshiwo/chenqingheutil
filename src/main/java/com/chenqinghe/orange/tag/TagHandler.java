package com.chenqinghe.orange.tag;

import com.chenqinghe.orange.node.SqlNode;
import org.dom4j.Element;

import java.util.List;

public interface TagHandler {

    void handle(Element element, List<SqlNode> contents);
}
