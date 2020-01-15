import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormArray, Form } from '@angular/forms';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
registerForm: FormGroup;
  constructor() { }

  ngOnInit() {
    this.registerForm = new FormGroup({
      name: new FormControl(null, [
        Validators.required,
        Validators.minLength(5)
      ]),
      email: new FormControl(null, [
        Validators.required,
        Validators.minLength(8),
        Validators.email
      ]),
      password: new FormControl(null, [
        Validators.required,
        Validators.minLength(8),
        Validators.maxLength(8)
      ]),
      age: new FormControl(null, [
        Validators.required,
        Validators.minLength(2),
        Validators.maxLength(3)
      ]),
      skills: new FormArray([
        this.getSkill()
      ])
    });

    console.log(this.registerForm.get('skills'));

    // console.log(this.name);
  }
  // submitForm(form: NgForm) {
  //   console.log(form.value);
  //   form.reset();
  // }

  // to push formControl to  formArray
  getSkill() {
    return new FormControl(null, [Validators.required, Validators.minLength(3)]);
  }
// to push FormControl (skill) to FormArray
  addSkill() {
    this.skills.push(this.getSkill());
  }
// to delete each skill
  deleteSkill(i: number) {
    this.skills.removeAt(i);
  }
// to access name field(FormControl)
  get name(): FormControl {
    return this.registerForm.get('name') as FormControl;
  }
// to access email field(FormControl)
  get email(): FormControl {
    return this.registerForm.get('email') as FormControl;
  }
// to access password field(FormControl)
  get password(): FormControl {
    return this.registerForm.get('password') as FormControl;
  }
// to access age field(FormControl)
  get age(): FormControl {
    return this.registerForm.get('age') as FormControl;
  }
// to access skills Array(FormArray)
  get skills(): FormArray {
    return this.registerForm.get('skills') as FormArray;
  }
// called after submitting form
  submitForm() {
    console.log(this.registerForm.value);
    this.registerForm.reset();
  }

}
