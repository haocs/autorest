﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System.Collections.Generic;
using System.Linq;
using AutoRest.Core.ClientModel;
using AutoRest.Core.Utilities;

namespace AutoRest.NodeJS.TemplateModels
{
    public class ParameterTemplateModel : Parameter
    {
        public ParameterTemplateModel(Parameter source)
        {
            this.LoadFrom(source);
        }

        public IEnumerable<Property> ComposedProperties
        {
            get
            {
                CompositeType composite = this.Type as CompositeType;
                IEnumerable<Property> result = null;
                if (composite != null)
                {
                    result = composite.Properties;
                    if (composite.BaseModelType != null)
                    {
                        result = composite.Properties;
                        IEnumerable<Property> baseModelProperties =
                            composite.BaseModelType.Properties.Where(p => !p.IsReadOnly);
                        result = result.Union(baseModelProperties);
                    }
                }
                return result;
            }
        }
    }
}