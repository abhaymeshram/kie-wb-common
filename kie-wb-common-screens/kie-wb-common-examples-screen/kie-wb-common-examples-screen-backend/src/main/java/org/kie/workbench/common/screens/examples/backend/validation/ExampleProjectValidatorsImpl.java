/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
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
 *
 */

package org.kie.workbench.common.screens.examples.backend.validation;

import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import com.google.common.collect.Lists;
import org.kie.workbench.common.screens.examples.validation.ExampleProjectValidator;
import org.kie.workbench.common.screens.examples.validation.ExampleProjectValidators;

@ApplicationScoped
public class ExampleProjectValidatorsImpl implements ExampleProjectValidators {

    private List<ExampleProjectValidator> validators;

    public ExampleProjectValidatorsImpl() {
    }

    @Inject
    public ExampleProjectValidatorsImpl(Instance<ExampleProjectValidator> validators) {
        this.validators = Lists.newArrayList(validators);
    }

    @Override
    public List<ExampleProjectValidator> getValidators() {
        return this.validators;
    }
}
