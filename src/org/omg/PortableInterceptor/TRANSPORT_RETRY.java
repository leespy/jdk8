package org.omg.PortableInterceptor;


/**
* org/omg/PortableInterceptor/TRANSPORT_RETRY.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /scratch/jenkins/workspace/8-2-build-linux-amd64/jdk8u261/295/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Wednesday, June 17, 2020 11:43:21 PM PDT
*/

public interface TRANSPORT_RETRY
{

  /**
     * Indicates a Transport Retry reply status. One possible value for 
     * <code>RequestInfo.reply_status</code>.
     * @see RequestInfo#reply_status
     * @see SUCCESSFUL
     * @see SYSTEM_EXCEPTION
     * @see USER_EXCEPTION
     * @see LOCATION_FORWARD
     */
  public static final short value = (short)(4);
}
