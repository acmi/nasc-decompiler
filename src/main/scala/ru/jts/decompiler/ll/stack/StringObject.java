/*
 * Copyright 2015-2017 JTS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.jts.decompiler.ll.stack;

import ru.jts.decompiler.ll.AiClass;

/**
 * Created by Дмитрий on 16.05.2015.
 */
public class StringObject extends StackObject {
    private final String str;

    public StringObject(AiClass aiClass, String str) {
        super(aiClass);
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}