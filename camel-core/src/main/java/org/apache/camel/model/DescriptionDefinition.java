/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 * Represents a description element which can be used on any element in the EIP route
 *
 * @version 
 */
@XmlRootElement(name = "description")
@XmlAccessorType(XmlAccessType.FIELD)
public class DescriptionDefinition {
    @XmlAttribute(required = false)
    private String lang;
    @XmlAttribute(required = false)
    private Double layoutX;
    @XmlAttribute(required = false)
    private Double layoutY;
    @XmlAttribute(required = false)
    private Double layoutWidth;
    @XmlAttribute(required = false)
    private Double layoutHeight;

    @XmlValue
    private String text;

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Double getLayoutHeight() {
        return layoutHeight;
    }

    public void setLayoutHeight(Double layoutHeight) {
        this.layoutHeight = layoutHeight;
    }

    public Double getLayoutWidth() {
        return layoutWidth;
    }

    public void setLayoutWidth(Double layoutWidth) {
        this.layoutWidth = layoutWidth;
    }

    public Double getLayoutX() {
        return layoutX;
    }

    public void setLayoutX(Double layoutX) {
        this.layoutX = layoutX;
    }

    public Double getLayoutY() {
        return layoutY;
    }

    public void setLayoutY(Double layoutY) {
        this.layoutY = layoutY;
    }
}
