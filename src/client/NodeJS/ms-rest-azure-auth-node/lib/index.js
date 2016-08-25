// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
'use strict';

exports.TokenCredentials = require('ms-rest').TokenCredentials;
exports.UserTokenCredentials = require('./credentials/userTokenCredentials');
exports.ApplicationTokenCredentials = require('./credentials/applicationTokenCredentials');
exports.DeviceTokenCredentials = require('./credentials/deviceTokenCredentials');
exports.AzureEnvironment = require('./azureEnvironment');
exports.interactiveLogin = require('./login').interactive;
exports.loginWithUsernamePassword = require('./login').withUsernamePassword;
exports.loginWithServicePrincipalSecret = require('./login').withServicePrincipalSecret;

exports = module.exports;