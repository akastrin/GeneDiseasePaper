/*
 * Concept profile generation tool suite
 * Copyright (C) 2015 Biosemantics Group, Erasmus University Medical Center,
 *  Rotterdam, The Netherlands
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

/**
 * EnrichProjectMemberData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2RC3 Feb 28, 2005 (10:15:14 EST) WSDL2Java emitter.
 */

package org.erasmusmc.webservice.biosemantics;

public class EnrichProjectMemberData  implements java.io.Serializable {
    private int projectID;
    private int userID;
    private java.lang.String name;
    private java.lang.String password;

    public EnrichProjectMemberData() {
    }

    public EnrichProjectMemberData(
           java.lang.String name,
           java.lang.String password,
           int projectID,
           int userID) {
           this.projectID = projectID;
           this.userID = userID;
           this.name = name;
           this.password = password;
    }


    /**
     * Gets the projectID value for this EnrichProjectMemberData.
     * 
     * @return projectID
     */
    public int getProjectID() {
        return projectID;
    }


    /**
     * Sets the projectID value for this EnrichProjectMemberData.
     * 
     * @param projectID
     */
    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }


    /**
     * Gets the userID value for this EnrichProjectMemberData.
     * 
     * @return userID
     */
    public int getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this EnrichProjectMemberData.
     * 
     * @param userID
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }


    /**
     * Gets the name value for this EnrichProjectMemberData.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this EnrichProjectMemberData.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the password value for this EnrichProjectMemberData.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this EnrichProjectMemberData.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnrichProjectMemberData)) return false;
        EnrichProjectMemberData other = (EnrichProjectMemberData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.projectID == other.getProjectID() &&
            this.userID == other.getUserID() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    @Override
	public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getProjectID();
        _hashCode += getUserID();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnrichProjectMemberData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:BioSemanticsIntf", "EnrichProjectMemberData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProjectID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
