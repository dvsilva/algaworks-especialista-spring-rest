# algaworks-especialista-spring-rest

github commands

```bash
git checkout -b 14-07-excluindo-e-substituindo-cadastro-de-foto-de-produto
git add .
git commit -m "Excluindo e substituindo cadastro de foto de produto"
git push origin 14-07-excluindo-e-substituindo-cadastro-de-foto-de-produto

git checkout master
git merge --no-ff 14-07-excluindo-e-substituindo-cadastro-de-foto-de-produto
git push

sair da tela de merge
aperte "ESC" depois digite ":wq"
configure other merge tool
git config --global core.editor "'C:/Program Files/Notepad++/notepad++.exe' -multiInst -notabbar -nosession -noPlugin"

// delete branch locally
git branch -d localBranchName

// delete branch remotely
git push origin --delete remoteBranchName
```