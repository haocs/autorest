// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information. 

'use strict';

/**
* Creates a filter to do the signing of a request.
* @param {object} authenticationProvider The authentication provider to use to sign the request.
*/
exports.create = function (authenticationProvider) {
  return function (resource, next, callback) {
    authenticationProvider.signRequest(resource, function(err) {
      if (err) {
        return callback(err);
      }
      return next(resource, callback);
    });
  };
};