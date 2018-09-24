<template>
  <div>
    <p>Hello Spring+Vue {{ message }}</p>
    <input type="text" v-model="message"/>
  </div>
</template>

<script>
  export default {
    data: function() {
      return {
        message: "(´Д｀)"
      }
    }
  }
</script>