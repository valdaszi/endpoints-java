/*
 * Copyright 2016 Google Inc. All Rights Reserved.
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
package com.google.api.server.spi.config.validation;

import com.google.api.server.spi.config.model.ApiParameterConfig;

/**
 * Exception for non-unique parameter names.
 *
 * @author Eric Orth
 */
public class DuplicateParameterNameException extends ApiParameterConfigInvalidException {
  private static final String ERROR_MESSAGE =
      "Duplicate parameter name. Parameter names must be unique.";

  public DuplicateParameterNameException(ApiParameterConfig config) {
    super(config, ERROR_MESSAGE);
  }
}
