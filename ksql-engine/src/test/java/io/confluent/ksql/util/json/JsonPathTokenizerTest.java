/**
 * Copyright 2017 Confluent Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 **/

package io.confluent.ksql.util.json;


import com.google.common.collect.ImmutableList;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class JsonPathTokenizerTest {

  @Test
  public void testJsonPathTokenizer() throws IOException {
    JsonPathTokenizer jsonPathTokenizer = new JsonPathTokenizer("$.log.cloud.region");
    ImmutableList<String> tokens = ImmutableList.copyOf(jsonPathTokenizer);
    List<String> tokenList = tokens.asList();
    Assert.assertTrue(tokenList.size() == 3);
    Assert.assertTrue(tokenList.get(0).equalsIgnoreCase("log"));
    Assert.assertTrue(tokenList.get(1).equalsIgnoreCase("cloud"));
    Assert.assertTrue(tokenList.get(2).equalsIgnoreCase("region"));

  }

}
