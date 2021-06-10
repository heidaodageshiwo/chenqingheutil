package com.chenqinghe.orange.tag;

import com.chenqinghe.orange.node.ForeachSqlNode;
import com.chenqinghe.orange.node.MixedSqlNode;
import com.chenqinghe.orange.node.SqlNode;
import org.apache.commons.lang3.StringUtils;
import org.dom4j.Element;

import java.util.List;


public class ForeachHandler implements TagHandler {
    @Override
    public void handle(Element element, List<SqlNode> targetContents) {
        List<SqlNode> contents = XmlParser.parseElement(element);

        String open = element.attributeValue("open");
        String close = element.attributeValue("close");
        String collection = element.attributeValue("collection");
        String separator = element.attributeValue("separator");
        String item = element.attributeValue("item");
        String index = element.attributeValue("index");

        if (StringUtils.isBlank(collection)) {
            throw new RuntimeException("<foreach> attribute missing : collection");
        }
        if (StringUtils.isBlank(item)) {
            item = "item";
        }
        if (StringUtils.isBlank(index)) {
            index = "index";
        }

        ForeachSqlNode foreachSqlNode = new ForeachSqlNode(collection, open, close, separator, item, index, new MixedSqlNode(contents));
        targetContents.add(foreachSqlNode);

    }
}
