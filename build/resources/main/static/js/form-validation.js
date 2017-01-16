    $(function() {

    $("form[name='registration']").validate({

      rules: {
        username: "required",
        age: "required",
        location: "required"
    },
    messages: {
      username: "Please enter your usertname",
      age: "Please enter your age",
      location: "Please enter your location"
    },
    submitHandler: function(form) {
      form.submit();
    }
  });
})