/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * IPTC Metadata Descriptions taken from the IPTC Photo Metadata (July 2010) 
 * standard. These parts Copyright 2010 International Press Telecommunications 
 * Council.
 */
package org.apache.tika.xmp.convert;

/**
 * Utility class to hold namespace information.
 */
public class Namespace 
{
	public String uri;
	public String prefix;

	public Namespace(String uri, String prefix) 
	{
		this.uri = uri;
		this.prefix = prefix;
	}
}
