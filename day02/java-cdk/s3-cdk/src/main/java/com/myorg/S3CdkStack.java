package com.myorg;

import software.amazon.awscdk.RemovalPolicy;
import software.amazon.awscdk.services.s3.Bucket;
import software.constructs.Construct;
import software.amazon.awscdk.Stack;
import software.amazon.awscdk.StackProps;
// import software.amazon.awscdk.Duration;
// import software.amazon.awscdk.services.sqs.Queue;

public class S3CdkStack extends Stack {
    public S3CdkStack(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public S3CdkStack(final Construct scope, final String id, final StackProps props) {
        super(scope, id, props);

            Bucket.Builder.create(this, "MyFirstBucket-shiva002")
                    .versioned(true).removalPolicy(RemovalPolicy.DESTROY).autoDeleteObjects(true).build();
    }
}
