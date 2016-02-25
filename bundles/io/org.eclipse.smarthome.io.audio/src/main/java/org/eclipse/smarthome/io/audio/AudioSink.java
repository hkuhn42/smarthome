/**
 * Copyright (c) 2015-2016 Harald Kuhn
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.io.audio;

import java.io.OutputStream;
import java.util.Set;

/**
 * Definition of an audio output like headphones, a speaker or for a writing to a file / clip
 * Also used by recognition service
 *
 * @author Harald Kuhn (hkuhn42) initial api
 */
public interface AudioSink {

	public String getId();
	
    /**
     * Returns the human readable name of the source
     *
     * @return the human readable name of the source
     */
    public String getLabel();

    /**
     * A set containing all supported audio formats this output can process
     *
     * @return
     */
    public AudioFormat getFormat();

    /**
     * An output stream for output audio, the format is set to the given format, throws and {@link UnsupportedAudioFormatException} if the given
     * format is not supported
     *
     * @return an OutputStream to read data from this output
     * @throws AudioException thrown among other reasons if the given format is not supported
     */
    public OutputStream getOutputStream() throws AudioException;
}
