# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.service_client import ServiceClient
from msrest import Configuration, Serializer, Deserializer
from .version import VERSION
from .operations.array import Array
from . import models


class AutoRestSwaggerBATArrayServiceConfiguration(Configuration):
    """Configuration for AutoRestSwaggerBATArrayService
    Note that all parameters used to create this instance are saved as instance
    attributes.

    :param str base_url: Service URL
    :param str filepath: Existing config
    """

    def __init__(
            self, base_url=None, filepath=None):

        if not base_url:
            base_url = 'http://localhost'

        super(AutoRestSwaggerBATArrayServiceConfiguration, self).__init__(base_url, filepath)

        self.add_user_agent('autorestswaggerbatarrayservice/{}'.format(VERSION))


class AutoRestSwaggerBATArrayService(object):
    """Test Infrastructure for AutoRest Swagger BAT

    :ivar config: Configuration for client.
    :vartype config: AutoRestSwaggerBATArrayServiceConfiguration

    :ivar array: Array operations
    :vartype array: .operations.Array

    :param str base_url: Service URL
    :param str filepath: Existing config
    """

    def __init__(
            self, base_url=None, filepath=None):

        self.config = AutoRestSwaggerBATArrayServiceConfiguration(base_url, filepath)
        self._client = ServiceClient(None, self.config)

        client_models = {k: v for k, v in models.__dict__.items() if isinstance(v, type)}
        self._serialize = Serializer(client_models)
        self._deserialize = Deserializer(client_models)

        self.array = Array(
            self._client, self.config, self._serialize, self._deserialize)
