// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.AdditionalProperties.Models
{
    using System.Linq;

    public partial class Pet
    {
        /// <summary>
        /// Initializes a new instance of the Pet class.
        /// </summary>
        public Pet() { }

        /// <summary>
        /// Initializes a new instance of the Pet class.
        /// </summary>
        /// <param name="additionalProperties">Unmatched properties from the
        /// message are deserialized this collection</param>
        public Pet(System.Collections.Generic.IDictionary<string, Feature> additionalProperties = default(System.Collections.Generic.IDictionary<string, Feature>), string name = default(string), int? birthday = default(int?), WithStringDictionary wsd = default(WithStringDictionary), WithUntypedDictionary wud = default(WithUntypedDictionary), WithTypedDictionary wtd = default(WithTypedDictionary))
        {
            AdditionalProperties = additionalProperties;
            Name = name;
            Birthday = birthday;
            Wsd = wsd;
            Wud = wud;
            Wtd = wtd;
        }

        /// <summary>
        /// Gets or sets unmatched properties from the message are
        /// deserialized this collection
        /// </summary>
        [Newtonsoft.Json.JsonExtensionData]
        public System.Collections.Generic.IDictionary<string, Feature> AdditionalProperties { get; set; }

        /// <summary>
        /// </summary>
        [Newtonsoft.Json.JsonProperty(PropertyName = "name")]
        public string Name { get; set; }

        /// <summary>
        /// </summary>
        [Newtonsoft.Json.JsonProperty(PropertyName = "birthday")]
        public int? Birthday { get; set; }

        /// <summary>
        /// </summary>
        [Newtonsoft.Json.JsonProperty(PropertyName = "wsd")]
        public WithStringDictionary Wsd { get; set; }

        /// <summary>
        /// </summary>
        [Newtonsoft.Json.JsonProperty(PropertyName = "wud")]
        public WithUntypedDictionary Wud { get; set; }

        /// <summary>
        /// </summary>
        [Newtonsoft.Json.JsonProperty(PropertyName = "wtd")]
        public WithTypedDictionary Wtd { get; set; }

    }
}
