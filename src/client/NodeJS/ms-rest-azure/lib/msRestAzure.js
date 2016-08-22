// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
'use strict';

var azureAuth = require('ms-rest-azure-auth-node');

exports.AzureServiceClient = require('./azureServiceClient');
exports.BaseResource = require('./baseResource');
exports.CloudError = require('./cloudError');
exports.TokenCredentials = require('ms-rest').TokenCredentials;

exports.generateUuid = require('./utils').generateUuid;

exports.UserTokenCredentials = azureAuth.UserTokenCredentials;
exports.ApplicationTokenCredentials = azureAuth.ApplicationTokenCredentials;
exports.DeviceTokenCredentials = azureAuth.DeviceTokenCredentials;
exports.AzureEnvironment = azureAuth.AzureEnvironment;
exports.interactiveLogin = azureAuth.interactiveLogin;
exports.loginWithUsernamePassword = azureAuth.loginWithUsernamePassword;
exports.loginWithServicePrincipalSecret = azureAuth.loginWithServicePrincipalSecret;

exports = module.exports;