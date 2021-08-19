/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to you under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jmeter.engine;

import java.rmi.RemoteException;

import org.apache.jmeter.junit.JMeterTestCase;
import org.junit.jupiter.api.Test;

public class IPv6RemoteWorkerTest extends JMeterTestCase {

    @Test
    public void testIPv6RemoteWorker() throws Exception {
        try {
            // ClientJMeterEngine clientJMeterEngine = new ClientJMeterEngine("127.0.0.1:abc"); // failing TC
            // ClientJMeterEngine clientJMeterEngine = new ClientJMeterEngine("127.0.0.1"); // ip v4
            ClientJMeterEngine clientJMeterEngine = new ClientJMeterEngine("::1"); // ip v6

        } catch (RemoteException remoteException) {
            // skip this in unit test
        } catch (Exception e) {
            throw e;
        }
    }
}

