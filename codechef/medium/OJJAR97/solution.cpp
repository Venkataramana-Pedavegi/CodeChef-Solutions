import React from "react";

function TextInput({ id, label, type = "text" }) {
const generatedId = React.useId();
const appliedId = id || generatedId;

return (
<div className="text-input">
<label htmlFor={appliedId}>{label}</label>
<input id={appliedId} type={type} className="input-field" />
</div>
);
}

export default function App() {
return <TextInput id="input-id" label="Enter Text:" />;
}