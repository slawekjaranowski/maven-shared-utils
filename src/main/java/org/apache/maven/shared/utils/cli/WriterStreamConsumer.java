package org.apache.maven.shared.utils.cli;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author <a href="mailto:jason@maven.org">Jason van Zyl</a>
 */
public class WriterStreamConsumer
    implements StreamConsumer
{

    private final BufferedWriter writer;

    /**
     * @param writer {@link Writer}
     */
    public WriterStreamConsumer( Writer writer )
    {
        super();
        this.writer = new BufferedWriter( writer );
    }

    @Override
    public void consumeLine( String line ) throws IOException
    {
        this.writer.append( line );
        this.writer.newLine();
        this.writer.flush();
    }

}
