package com.chenqinghe.orange.tag;

import com.chenqinghe.orange.node.MixedSqlNode;
import com.chenqinghe.orange.node.SqlNode;
import com.chenqinghe.orange.node.WhereSqlNode;
import org.dom4j.Element;

import java.util.List;


public class WhereHandler implements TagHandler{

    @Override
    public void handle(Element element, List<SqlNode> targetContents) {
        List<SqlNode> contents = XmlParser.parseElement(element);

        WhereSqlNode node = new WhereSqlNode(new MixedSqlNode(contents));
        targetContents.add(node);
    }
}
