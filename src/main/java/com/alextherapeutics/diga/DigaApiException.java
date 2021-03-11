/*
 * Copyright 2021-2021 Alex Therapeutics AB and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package com.alextherapeutics.diga;

/**
 * The DiGA API client failed to initialize
 */
public class DigaApiException extends Exception {
    public DigaApiException(String msg) {
        super(msg);
    }

    public DigaApiException(Throwable e) {
        super("Exception thrown: " + e.toString(), e);
    }

    public DigaApiException(Throwable e, String msg) {
        super("Exception thrown: " + e.toString() + "\nWith message: " + msg, e);
    }
}
