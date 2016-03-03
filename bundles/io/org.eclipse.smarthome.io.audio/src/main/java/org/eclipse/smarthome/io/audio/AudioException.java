/**
 * Copyright (c) 2015-2016 Harald Kuhn
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.io.audio;

/**
 * General purpose audio exception
 *
 * @author Harald Kuhn (hkuhn42) initial api
 */
public class AudioException extends Exception {

    private static final long serialVersionUID = 1L;

   /**
    * Constructs a new exception with null as its detail message.
    */
    public AudioException() {
        super();
    }

   /**
    * Constructs a new exception with the specified detail message and cause.
    *
    * @param message Detail message
    * @param cause The cause 
    */
    public AudioException(String message, Throwable cause) {
        super(message, cause);
    }

   /**
    * Constructs a new exception with the specified detail message.
    *
    * @param message Detail message
    */
    public AudioException(String message) {
        super(message);
    }

   /**
    * Constructs a new exception with the specified cause.
    *
    * @param cause The cause 
    */
    public AudioException(Throwable cause) {
        super(cause);
    }
}
