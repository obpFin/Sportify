    $(function() {

    $("form[name='registration']").validate({

      rules: {
        username: "required",
        age: "required",
        location: "required"
    },
    messages: {
      username: "Please enter your username",
      age: "Please enter your age",
      location: "Please enter your location"
    },
    submitHandler: function(form) {
      form.submit();
    }
  });
})