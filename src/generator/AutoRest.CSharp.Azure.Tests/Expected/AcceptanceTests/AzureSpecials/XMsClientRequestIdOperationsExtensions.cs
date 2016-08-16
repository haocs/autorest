// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.Azure.AcceptanceTestsAzureSpecials
{
    using System.Threading.Tasks;
   using Microsoft.Rest.Azure;
   using Models;

    /// <summary>
    /// Extension methods for XMsClientRequestIdOperations.
    /// </summary>
    public static partial class XMsClientRequestIdOperationsExtensions
    {
            /// <summary>
            /// Get method that overwrites x-ms-client-request header with value
            /// 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            public static void Get(this IXMsClientRequestIdOperations operations)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IXMsClientRequestIdOperations)s).GetAsync(), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get method that overwrites x-ms-client-request header with value
            /// 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task GetAsync(this IXMsClientRequestIdOperations operations, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.GetWithHttpMessagesAsync(null, cancellationToken).ConfigureAwait(false);
            }

            /// <summary>
            /// Get method that overwrites x-ms-client-request header with value
            /// 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='xMsClientRequestId'>
            /// This should appear as a method parameter, use value
            /// '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0'
            /// </param>
            public static void ParamGet(this IXMsClientRequestIdOperations operations, string xMsClientRequestId)
            {
                System.Threading.Tasks.Task.Factory.StartNew(s => ((IXMsClientRequestIdOperations)s).ParamGetAsync(xMsClientRequestId), operations, System.Threading.CancellationToken.None, System.Threading.Tasks.TaskCreationOptions.None,  System.Threading.Tasks.TaskScheduler.Default).Unwrap().GetAwaiter().GetResult();
            }

            /// <summary>
            /// Get method that overwrites x-ms-client-request header with value
            /// 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0.
            /// </summary>
            /// <param name='operations'>
            /// The operations group for this extension method.
            /// </param>
            /// <param name='xMsClientRequestId'>
            /// This should appear as a method parameter, use value
            /// '9C4D50EE-2D56-4CD3-8152-34347DC9F2B0'
            /// </param>
            /// <param name='cancellationToken'>
            /// The cancellation token.
            /// </param>
            public static async System.Threading.Tasks.Task ParamGetAsync(this IXMsClientRequestIdOperations operations, string xMsClientRequestId, System.Threading.CancellationToken cancellationToken = default(System.Threading.CancellationToken))
            {
                await operations.ParamGetWithHttpMessagesAsync(xMsClientRequestId, null, cancellationToken).ConfigureAwait(false);
            }

    }
}
