package com.gatehi.cv.models

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
class User1{

    var firstName:String=""
    var lastName :String=""
    var slackUsername :String=""
    var githubHandle :String=""
    var linkedinn :String=""
    var bio :String=""
    var skill :String=""

    constructor(firstName:String,lastName:String,slackUsername:String, githubHandle :String,linkedinn:String,bio:String,skill:String){
        this.firstName=firstName
        this.lastName=lastName
        this.slackUsername=slackUsername
        this.githubHandle=githubHandle
        this.linkedinn=linkedinn
        this.bio=bio
        this.skill=skill
    }
    constructor()
}