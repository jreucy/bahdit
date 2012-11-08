/**
 * Copyright 2012 Booz Allen Hamilton. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  Booz Allen Hamilton licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bah.applefox.tests.plugins.imageindex;


import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.MalformedURLException;


import org.junit.Test;
import com.bah.applefox.main.plugins.imageindex.utilites.*;

public class ImageHasherTests {

	@Test
	public void testHashing() throws MalformedURLException, IOException{
		
		
		String hash1 = ImageHasher.hash("http://www.boozallen.com/media/image/Shrader-Ralph-130x130.jpg");
		String hash2 = ImageHasher.hash("http://www.boozallen.com/media/image/Shrader-Ralph-130x130.jpg");
		
		
		// Make sure the same hash is returned for the same image
		assertEquals(hash1, hash2);
		
		
		
	}

}
