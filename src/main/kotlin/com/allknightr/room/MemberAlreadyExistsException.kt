package com.allknightr.room

class MemberAlreadyExistsException: Exception(
    "There is already a member with this username in the room."
)