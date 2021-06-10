package com.chenqinghe.orange.tag;

import com.chenqinghe.orange.node.MixedSqlNode;
import com.chenqinghe.orange.node.SetSqlNode;
import com.chenqinghe.orange.node.SqlNode;
import org.dom4j.Element;

import java.util.List;


public class SetHandler implements TagHandler{

    @Override
    public void handle(Element element, List<SqlNode> targetContents) {
        List<SqlNode> contents = XmlParser.parseElement(element);

        SetSqlNode node = new SetSqlNode(new MixedSqlNode(contents));
        targetContents.add(node);
    }
}
